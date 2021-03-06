import configparser
from flask_sqlalchemy import SQLAlchemy
from flask import Flask, jsonify, request

application = Flask(__name__)

config = configparser.ConfigParser()
config.read('F:\Veres Labs\Lab5/products_db.conf')

application.config['SQLALCHEMY_DATABASE_URI'] = 'mysql://' + config.get('DB', 'user') + \
                                                ':' + config.get('DB', 'password') + '@' + \
                                                config.get('DB', 'host') + '/' + config.get('DB', 'db')

application.config['SQLALCHEMY_TRACK_MODIFICATIONS'] = True

mysql = SQLAlchemy()
mysql.init_app(application)


class Techniques(mysql.Model):
    __tablename__ = 'technique'
    id = mysql.Column(mysql.Integer, primary_key=True)
    rate = mysql.Column(mysql.Integer, nullable=False)
    name = mysql.Column(mysql.String(128), nullable=False)
    price = mysql.Column(mysql.Float, nullable=False)
    amount = mysql.Column(mysql.Integer, nullable=False)

    def __repr__(self):
        return '<Techniques (%s, %s, %s, %s) >' % (self.rate, self.name, self.price, self.amount)


@application.route("/")
def hello():
    return "Hello World!"


@application.route('/techniques', methods=['POST'])
def create_product():
    id = request.get_json()["id"]
    rate = request.get_json()["rate"]
    name = request.get_json()["name"]
    price = request.get_json()["price"]
    amount = request.get_json()["amount"]
    curr_session = mysql.session

    product = Techniques(id=id, rate=rate, name=name, price=price, amount=amount)

    try:
        curr_session.add(product)
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    product_id = product.id
    data = Techniques.query.filter_by(id=product_id).first()

    config.read('F:\Veres Labs\Lab5/products_db.conf')

    result = [data.name, data.rate, data.price, data.amount]

    return jsonify(session=result)


@application.route('/techniques', methods=['GET'])
def get_product():
    data = Techniques.query.all()

    data_all = []

    for product in data:
        data_all.append([product.id, product.name, product.rate, product.price, product.amount])

    return jsonify(products=data_all)


@application.route('/techniques', methods=['PATCH'])
def update_product():
    global product
    product_id = request.get_json()["id"]
    rate = request.get_json()["rate"]
    name = request.get_json()["name"]
    price = request.get_json()["price"]
    amount = request.get_json()["amount"]
    curr_session = mysql.session

    try:
        product = Techniques.query.filter_by(id=product_id).first()
        product.rate = rate
        product.name = name
        product.price = price
        product.amount = amount
        curr_session.commit()
    except:
        curr_session.rollback()
        curr_session.flush()

    product_id = product.id
    data = Techniques.query.filter_by(id=product_id).first()

    config.read('F:\Veres Labs\Lab5/products_db.conf')

    result = [data.name, data.rate, data.price, data.amount]

    return jsonify(session=result)


@application.route('/techniques/<int:product_id>', methods=['DELETE'])
def delete_product(product_id):
    curr_session = mysql.session

    Techniques.query.filter_by(id=product_id).delete()
    curr_session.commit()

    return get_product()


if __name__ == "__main__":
    application.run()
