fun main()
{
    print("Введите количество строк: ")
    val stroki = readLine()?.toIntOrNull() ?: 0
    print("Введите количество столбцов: ")
    val stolb = readLine()?.toIntOrNull() ?: 0

    if (stroki <= 0 || stolb <= 0)
    {
        println("Некорректные размеры массива.")
        return
    }

    val array = Array(stroki) { IntArray(stolb) }

    println("Введите ${stroki * stolb} трехзначных чисел:")
    for (i in 0 until stroki)
    {
        for (j in 0 until stolb)
        {
            var s: Int
            do
            {
                print("Введите число для позиции [$i][$j]: ")
                s = readLine()?.toIntOrNull() ?: 0
            } while (s !in 100..999)
            array[i][j] = s
        }
    }

    println("Двумерный массив:")
    for (i in 0 until stroki)
    {
        for (j in 0 until stolb)
        {
            print("${array[i][j]} \t")
        }
        println()
    }

    val Set = mutableSetOf<Int>()
    for (i in 0 until stroki)
    {
        for (j in 0 until stolb)
        {
            val s1 = array[i][j]
            Set.add(s1 / 100)
            Set.add((s1 % 100) / 10)
            Set.add(s1 % 10)
        }
    }

    println("В массиве использовано ${Set.size} различных цифр")
}