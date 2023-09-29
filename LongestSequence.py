def lengthOfLongestSubstring(s: str) -> int:
    stack = []
    str_len = 0
    print(s)
    if (len(s) > 0):
        print(str_len)
        for i in s:  
            if(i in stack):
                if(len(stack) > str_len):
                    str_len = len(stack)
                    print(str_len)
                stack.clear()
                stack.append(i)
            else:
                stack.append(i)
    else:
        print(0)
    
    if(len(stack) > str_len):
        str_len = len(stack)

    print(str_len)


lengthOfLongestSubstring("pwwkew ")
    