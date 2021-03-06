from ua.com.lviv.iot.Light import Light
from ua.com.lviv.iot.SkiLift import SkiLift, Technique
from ua.com.lviv.iot.SkiiTechniqueManager import SkiiTechniqueManager

from ua.com.lviv.iot.SnowBlower import SnowBlower

if __name__ == "__main__":
    skilift = SkiLift("Ліфт", 1, 10)
    snow = SnowBlower("SnowBlower", 2, 3)
    light = Light("Світло", 30,15)
    manager = SkiiTechniqueManager()
    manager.add_good(skilift)
    manager.add_good(snow)
    manager.add_good(light)
    manager.print_list()
    print("Пошук за типом:","\n" )
    manager.find_type("LIGHT")
    print("Пошук за колесом:", "\n")
    manager.find_wheel("WOODEN")
    print("Посортований:")
    for tech in manager.sort_run():
        print(tech.to_string())
        my_dict = {1: 'apple', 2: 'ball'}