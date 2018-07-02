from techniques.Technique import *
from enums.WheelType import Wheel


class SkiLift(Technique):
    def __init__(self, name="unknown", amount=0, run=0):
        super().__init__(name, amount, run)
        self.type = Types.SKILIFT.name
        self.wheel = Wheel.WOODEN.name
