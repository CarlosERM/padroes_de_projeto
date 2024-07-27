Você foi contratado para desenvolver um sistema de processamento de transações bancárias utilizando o padrão de projeto Chain of Responsibility. O objetivo é criar uma cadeia de manipuladores que possam processar diferentes tipos de transações (depósitos, saques e transferências) e aplicar uma série de verificações e operações antes de finalizar cada transação.

Implemente três classes concretas de manipuladores (DepositHandler, WithdrawHandler e TransferHandler) que implementem a interface TransactionHandler.

DepositHandler: Verifica se o valor do depósito é positivo e processa o depósito na conta.

WithdrawHandler: Verifica se a conta tem saldo suficiente para o saque e processa o saque.

TransferHandler: Verifica se a conta de origem tem saldo suficiente para a transferência e processa a transferência para a conta de destino.

Configure a cadeia de responsabilidade, onde o DepositHandler está no início, seguido pelo WithdrawHandler e depois pelo TransferHandler.

Crie uma classe de cliente que configure a cadeia de responsabilidade e processe diferentes tipos de transações.

Exemplos de transações a serem processadas:

Um depósito em uma conta.

Um saque de uma conta.

Uma transferência entre duas contas.

Uma transação de tipo inválido (que não deve ser processada por nenhum manipulador).

Adicione validações adicionais conforme necessário, como limites máximos de saque ou depósito, e trate casos onde a transação não pode ser processada (por exemplo, saldo insuficiente).