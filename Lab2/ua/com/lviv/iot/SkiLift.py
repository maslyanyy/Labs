from ua.com.lviv.iot.GazolineType import Gaz
from ua.com.lviv.iot.Technique import *
from ua.com.lviv.iot.WheelType import Wheel


class SkiLift(Technique):
    def __init__(self, name="unknown", amount=0, run=0):
        super().__init__(name, amount,run)
        self.type = Types.SKILIFT.name
        self.wheel = Wheel.WOODEN.name
        self.gazolineType = Gaz.A95.name
