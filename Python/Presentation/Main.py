from pathlib import Path
import sys
path_root = Path(__file__).parents[2]
sys.path.append(str(path_root))

from Python.Application.Services.FuncionarioService import FuncionarioService

for func in FuncionarioService().GetFuncionarios():
    print(func)