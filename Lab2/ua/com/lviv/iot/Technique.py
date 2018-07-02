from ua.com.lviv.iot import WheelType, GazolineType
from ua.com.lviv.iot.GazolineType import Gaz

from ua.com.lviv.iot.Types import Types
from ua.com.lviv.iot.WheelType import Wheel


class Technique:
    def __init__(self, name="unknown", amount=0, run=0):
        self.name = name
        self.amount = amount
        self.run = run
        self.type = Types.TECHNIQUE.name
        self.wheel = Wheel.WOODEN.name
        self.gazolineType = Gaz.A92.name

    def to_string(self):
            return "Type:", self.type, " Name:", self.name, " Amount:", self.amount, " Wheel:", self.wheel, " Gaz:", self.gazolineType , " Run:", self.run
