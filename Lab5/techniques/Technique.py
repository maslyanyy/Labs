from enums.Types import Types
from enums.WheelType import Wheel


class Technique:
    def __init__(self, name="unknown", amount=0, run=0):
        self.name = name
        self.amount = amount
        self.run = run
        self.type = Types.TECHNIQUE.name
        self.wheel = Wheel.WOODEN.name

    def to_string(self):
            return "Type:", self.type, " Name:", self.name, " Amount:", self.amount, " Wheel:", self.wheel, " Run:", self.run
