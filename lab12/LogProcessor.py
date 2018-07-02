import re


if __name__ == "__main__":

    pattern = r"\S+\s\S+\s\S+\s\S+(?:sportszone)\S+(?:gif)(?:\s|\S)+"
    number_of_matched_requests = 0
    read_lines = 0

    with open("con267.tweetie.799608879") as file:
        for line in file:
            read_lines += 1
            if re.match(pattern, line):
                number_of_matched_requests += 1
                print(re.findall(pattern, line))

    print("\nNumber of all read lines: %d" % read_lines)
    print("\nNumber of all gif requests for sportszone: %d" % number_of_matched_requests)
