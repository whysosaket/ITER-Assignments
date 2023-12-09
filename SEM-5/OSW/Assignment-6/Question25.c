#include<stdio.h>
#include<string.h>
#include<ctype.h>

enum state {start, identifier, number, stop, build_identifier, build_number};

enum state transition(enum state current_state, char transition_char){
    switch (current_state) {
        case start:
            if (isalpha(transition_char))
                return build_identifier;
            else if (isdigit(transition_char))
                return build_number;
            else if (transition_char == ' ')
                return start;
            else if (transition_char == '\n')
                return stop;
            else
                return start;
            break;
        case build_identifier:
            if (isalpha(transition_char))
                return build_identifier;
            else if (isdigit(transition_char))
                return build_identifier;
            else if (transition_char == ' ')
                return identifier;
            else if (transition_char == '\n')
                return identifier;
            else
                return start;
            break;
        case build_number:
            if (isalpha(transition_char))
                return build_number;
            else if (isdigit(transition_char))
                return build_number;
            else if (transition_char == ' ')
                return number;
            else if (transition_char == '\n')
                return number;
            else
                return start;
            break;
        case identifier:
            if (isalpha(transition_char))
                return build_identifier;
            else if (isdigit(transition_char))
                return build_number;
            else if (transition_char == ' ')
                return identifier;
            else if (transition_char == '\n')
                return identifier;
            else
                return start;
            break;
        case number:
            if (isalpha(transition_char))
                return build_identifier;
            else if (isdigit(transition_char))
                return build_number;
            else if (transition_char == ' ')
                return number;
            else if (transition_char == '\n')
                return number;
            else
                return start;
            break;
        case stop:
            return stop;
            break;
        default:
            return start;
            break;
    }
}

int main(){
    enum state current_state = start;
    char transition_char;
    do {
        if (current_state == identifier) {
            printf(" - Identifier\n");
            current_state = start;
        } else if (current_state == number) {
            printf(" - Number\n");
            current_state = start;
        }
        scanf("%c", &transition_char);
        if (transition_char != ' ' && transition_char != '\n')
            printf("%c", transition_char);
        current_state = transition(current_state, transition_char);
    } while (current_state != stop);
    return 0;
}