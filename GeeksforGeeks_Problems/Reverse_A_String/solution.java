class Solution:
    def reverseWord(self, input_word):
        word_length = len(input_word)
        
        if word_length < 2:
            return input_word
        
        char_list = list(input_word)
        left_ptr, right_ptr = 0, word_length - 1
        
        while left_ptr <= right_ptr:
            char_list[left_ptr], char_list[right_ptr] = char_list[right_ptr], char_list[left_ptr]
            left_ptr, right_ptr = left_ptr + 1, right_ptr - 1
        
        return "".join(char_list)