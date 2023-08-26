from pathlib import Path
import sys
path_root = Path(__file__).parents[2]
sys.path.append(str(path_root))

import unittest

from Python.Domain.Models.Funcionario import Funcionario

class ValidationTests(unittest.TestCase):

    def test_instancia_funcionario(self):
        func = Funcionario('Jorge')
        self.assertEqual(0, func.id)

if(__name__ == '__main__'):
    unittest.main()