from flask import Flask, abort
from flask_restful import Api, Resource, reqparse, fields, marshal

app = Flask(__name__, static_url_path="")
api = Api(app)

techniques = {}

techniques_fields = {
    'id': fields.Integer,
    'name': fields.String,
    'run': fields.String,
    'type': fields.String,
    'amount': fields.Integer,
    'wheel': fields.String
}


class Techniques(Resource):
    def __init__(self):
        self.reqparse = reqparse.RequestParser()
        self.reqparse.add_argument('id', type=int, location='json')
        self.reqparse.add_argument('name', type=str, location='json')
        self.reqparse.add_argument('run', type=str, location='json')
        self.reqparse.add_argument('type', type=str, location='json')
        self.reqparse.add_argument('amount', type=int, location='json')
        self.reqparse.add_argument('wheel', type=str, location='json')
        super(Techniques, self).__init__()

    @app.route('/techniques')
    def put(self):
        args = self.reqparse.parse_args()
        technique = {
            'id': args['id'],
            'name': args['name'],
            'run': args['run'],
            'type': args['type'],
            'amount': args['amount'],
            'wheel': args['wheel']
        }
        techniques.update(technique)
        return marshal(technique, techniques_fields), 201

    @app.route('/techniques')
    def post(self):
        args = self.reqparse.parse_args()
        technique = [technique for technique in techniques if techniques.get('id') == args['id']]
        if len(technique) == 0:
            abort(404)
        techniques.pop(technique[0])
        new_technique = {
            'id': args['id'],
            'name': args['name'],
            'run': args['run'],
            'type': args['type'],
            'amount': args['amount'],
            'wheel': args['wheel']
        }
        techniques.update(new_technique)
        return marshal(new_technique, techniques_fields)

    @app.route('/techniques/<int:id>')
    def get(self, id):
        technique = [technique for technique in techniques if techniques.get('id') == id]
        if len(technique) == 0:
            abort(404)
        return marshal(technique[0], techniques_fields)

    @app.route('/techniques/<int:id>')
    def delete(self, id):
        technique = [technique for technique in techniques if techniques.get('id') == id]
        if len(technique) == 0:
            abort(404)
        techniques.pop(technique[0])
        return {'result': True}


api.add_resource(Techniques, '/techniques', endpoint='techniques')
api.add_resource(Techniques, '/techniques/<int:id>', endpoint='good')

if __name__ == '__main__':
    app.run(debug=True)
