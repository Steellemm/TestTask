package com.steellemm.testtask;

import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.4.1.
 */
@SuppressWarnings("rawtypes")
public class TestTask extends Contract {
    public static final String BINARY = "{\n"
            + "\t\"functionDebugData\": {\n"
            + "\t\t\"@_465\": {\n"
            + "\t\t\t\"entryPoint\": null,\n"
            + "\t\t\t\"id\": 465,\n"
            + "\t\t\t\"parameterSlots\": 0,\n"
            + "\t\t\t\"returnSlots\": 0\n"
            + "\t\t},\n"
            + "\t\t\"panic_error_0x41\": {\n"
            + "\t\t\t\"entryPoint\": 1275,\n"
            + "\t\t\t\"id\": null,\n"
            + "\t\t\t\"parameterSlots\": 0,\n"
            + "\t\t\t\"returnSlots\": 0\n"
            + "\t\t}\n"
            + "\t},\n"
            + "\t\"generatedSources\": [\n"
            + "\t\t{\n"
            + "\t\t\t\"ast\": {\n"
            + "\t\t\t\t\"nodeType\": \"YulBlock\",\n"
            + "\t\t\t\t\"src\": \"0:190:3\",\n"
            + "\t\t\t\t\"statements\": [\n"
            + "\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\"body\": {\n"
            + "\t\t\t\t\t\t\t\"nodeType\": \"YulBlock\",\n"
            + "\t\t\t\t\t\t\t\"src\": \"35:152:3\",\n"
            + "\t\t\t\t\t\t\t\"statements\": [\n"
            + "\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\"expression\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\"arguments\": [\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"52:1:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"0\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"55:77:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"35408467139433450592217433187231851964531694900788300625387963629091585785856\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t}\n"
            + "\t\t\t\t\t\t\t\t\t\t],\n"
            + "\t\t\t\t\t\t\t\t\t\t\"functionName\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"name\": \"mstore\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulIdentifier\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"src\": \"45:6:3\"\n"
            + "\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulFunctionCall\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\"src\": \"45:88:3\"\n"
            + "\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulExpressionStatement\",\n"
            + "\t\t\t\t\t\t\t\t\t\"src\": \"45:88:3\"\n"
            + "\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\"expression\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\"arguments\": [\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"149:1:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"4\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"152:4:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"0x41\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t}\n"
            + "\t\t\t\t\t\t\t\t\t\t],\n"
            + "\t\t\t\t\t\t\t\t\t\t\"functionName\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"name\": \"mstore\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulIdentifier\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"src\": \"142:6:3\"\n"
            + "\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulFunctionCall\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\"src\": \"142:15:3\"\n"
            + "\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulExpressionStatement\",\n"
            + "\t\t\t\t\t\t\t\t\t\"src\": \"142:15:3\"\n"
            + "\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\"expression\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\"arguments\": [\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"173:1:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"0\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\t{\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"kind\": \"number\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulLiteral\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"src\": \"176:4:3\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"type\": \"\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\t\"value\": \"0x24\"\n"
            + "\t\t\t\t\t\t\t\t\t\t\t}\n"
            + "\t\t\t\t\t\t\t\t\t\t],\n"
            + "\t\t\t\t\t\t\t\t\t\t\"functionName\": {\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"name\": \"revert\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulIdentifier\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\t\"src\": \"166:6:3\"\n"
            + "\t\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulFunctionCall\",\n"
            + "\t\t\t\t\t\t\t\t\t\t\"src\": \"166:15:3\"\n"
            + "\t\t\t\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\t\t\t\"nodeType\": \"YulExpressionStatement\",\n"
            + "\t\t\t\t\t\t\t\t\t\"src\": \"166:15:3\"\n"
            + "\t\t\t\t\t\t\t\t}\n"
            + "\t\t\t\t\t\t\t]\n"
            + "\t\t\t\t\t\t},\n"
            + "\t\t\t\t\t\t\"name\": \"panic_error_0x41\",\n"
            + "\t\t\t\t\t\t\"nodeType\": \"YulFunctionDefinition\",\n"
            + "\t\t\t\t\t\t\"src\": \"7:180:3\"\n"
            + "\t\t\t\t\t}\n"
            + "\t\t\t\t]\n"
            + "\t\t\t},\n"
            + "\t\t\t\"contents\": \"{\\n\\n    function panic_error_0x41() {\\n        mstore(0, 35408467139433450592217433187231851964531694900788300625387963629091585785856)\\n        mstore(4, 0x41)\\n        revert(0, 0x24)\\n    }\\n\\n}\\n\",\n"
            + "\t\t\t\"id\": 3,\n"
            + "\t\t\t\"language\": \"Yul\",\n"
            + "\t\t\t\"name\": \"#utility.yul\"\n"
            + "\t\t}\n"
            + "\t],\n"
            + "\t\"linkReferences\": {},\n"
            + "\t\"object\": \"6080604052739ac64cc6e4415144c455bd8e4837fea55603e5c36000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600267ffffffffffffffff811115610073576100726104fb565b5b6040519080825280602002602001820160405280156100a15781602001602082028036833780820191505090505b50600190805190602001906100b7929190610454565b50600267ffffffffffffffff8111156100d3576100d26104fb565b5b6040519080825280602002602001820160405280156101015781602001602082028036833780820191505090505b5060029080519060200190610117929190610454565b50600267ffffffffffffffff811115610133576101326104fb565b5b6040519080825280602002602001820160405280156101615781602001602082028036833780820191505090505b5060039080519060200190610177929190610454565b5034801561018457600080fd5b506001737130d2a12b9bcbfae4f2634d864a1ee1ce3ead9c9080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600173e9e7cea3dedca5984780bafc599bd69add087d569080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506002737130d2a12b9bcbfae4f2634d864a1ee1ce3ead9c9080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff160217905550600273bb4cdb9cbd36b01bd1cbaebf2de08d9173bc095c9080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506003737130d2a12b9bcbfae4f2634d864a1ee1ce3ead9c9080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506003732170ed0880ac9a755fd29b2688956bd959f933f89080600181540180825580915050600190039060005260206000200160009091909190916101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555061052a565b8280548282559060005260206000209081019282156104cd579160200282015b828111156104cc5782518260006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555091602001919060010190610474565b5b5090506104da91906104de565b5090565b5b808211156104f75760008160009055506001016104df565b5090565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b610747806105396000396000f3fe608060405234801561001057600080fd5b50600436106100415760003560e01c806314f6c3be1461004657806378a619de14610064578063e62854c714610082575b600080fd5b61004e6100a0565b60405161005b91906104f4565b60405180910390f35b61006c610175565b60405161007991906104f4565b60405180910390f35b61008a61024a565b60405161009791906104f4565b60405180910390f35b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663d06ca61f600160036040518363ffffffff1660e01b81526004016101009291906104c4565b60006040518083038186803b15801561011857600080fd5b505afa15801561012c573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f8201168201806040525081019061015591906103d1565b60018151811061016857610167610657565b5b6020026020010151905090565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663d06ca61f600160026040518363ffffffff1660e01b81526004016101d59291906104c4565b60006040518083038186803b1580156101ed57600080fd5b505afa158015610201573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f8201168201806040525081019061022a91906103d1565b60018151811061023d5761023c610657565b5b6020026020010151905090565b60008060009054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff1663d06ca61f6001806040518363ffffffff1660e01b81526004016102a99291906104c4565b60006040518083038186803b1580156102c157600080fd5b505afa1580156102d5573d6000803e3d6000fd5b505050506040513d6000823e3d601f19601f820116820180604052508101906102fe91906103d1565b60018151811061031157610310610657565b5b6020026020010151905090565b600061033161032c84610534565b61050f565b90508083825260208201905082856020860282011115610354576103536106cd565b5b60005b85811015610384578161036a88826103bc565b845260208401935060208301925050600181019050610357565b5050509392505050565b600082601f8301126103a3576103a26106c8565b5b81516103b384826020860161031e565b91505092915050565b6000815190506103cb816106fa565b92915050565b6000602082840312156103e7576103e66106d7565b5b600082015167ffffffffffffffff811115610405576104046106d2565b5b6104118482850161038e565b91505092915050565b60006104268383610432565b60208301905092915050565b61043b816105be565b82525050565b600061044c82610575565b610456818561058d565b935061046183610560565b8060005b8381101561049957610476826106b5565b610480888261041a565b975061048b83610580565b925050600181019050610465565b5085935050505092915050565b6104af816105fa565b82525050565b6104be816105f0565b82525050565b60006040820190506104d960008301856104a6565b81810360208301526104eb8184610441565b90509392505050565b600060208201905061050960008301846104b5565b92915050565b600061051961052a565b90506105258282610626565b919050565b6000604051905090565b600067ffffffffffffffff82111561054f5761054e610686565b5b602082029050602081019050919050565b60008190508160005260206000209050919050565b600081549050919050565b6000600182019050919050565b600082825260208201905092915050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b60006105c9826105d0565b9050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b6000610605826105f0565b9050919050565b600061061f61061a836106ed565b61059e565b9050919050565b61062f826106dc565b810181811067ffffffffffffffff8211171561064e5761064d610686565b5b80604052505050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052603260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b60006106c1825461060c565b9050919050565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b60008160001c9050919050565b610703816105f0565b811461070e57600080fd5b5056fea26469706673582212207622455f23bd6ac80dccd7c1d2f53fd91327f90a3fd7cfa2a445506e1a0cfc4964736f6c63430008070033\",\n"
            + "\t\"opcodes\": \"PUSH1 0x80 PUSH1 0x40 MSTORE PUSH20 0x9AC64CC6E4415144C455BD8E4837FEA55603E5C3 PUSH1 0x0 DUP1 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x2 PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x73 JUMPI PUSH2 0x72 PUSH2 0x4FB JUMP JUMPDEST JUMPDEST PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0xA1 JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CALLDATASIZE DUP4 CALLDATACOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP PUSH1 0x1 SWAP1 DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH2 0xB7 SWAP3 SWAP2 SWAP1 PUSH2 0x454 JUMP JUMPDEST POP PUSH1 0x2 PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0xD3 JUMPI PUSH2 0xD2 PUSH2 0x4FB JUMP JUMPDEST JUMPDEST PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0x101 JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CALLDATASIZE DUP4 CALLDATACOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP PUSH1 0x2 SWAP1 DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH2 0x117 SWAP3 SWAP2 SWAP1 PUSH2 0x454 JUMP JUMPDEST POP PUSH1 0x2 PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x133 JUMPI PUSH2 0x132 PUSH2 0x4FB JUMP JUMPDEST JUMPDEST PUSH1 0x40 MLOAD SWAP1 DUP1 DUP3 MSTORE DUP1 PUSH1 0x20 MUL PUSH1 0x20 ADD DUP3 ADD PUSH1 0x40 MSTORE DUP1 ISZERO PUSH2 0x161 JUMPI DUP2 PUSH1 0x20 ADD PUSH1 0x20 DUP3 MUL DUP1 CALLDATASIZE DUP4 CALLDATACOPY DUP1 DUP3 ADD SWAP2 POP POP SWAP1 POP JUMPDEST POP PUSH1 0x3 SWAP1 DUP1 MLOAD SWAP1 PUSH1 0x20 ADD SWAP1 PUSH2 0x177 SWAP3 SWAP2 SWAP1 PUSH2 0x454 JUMP JUMPDEST POP CALLVALUE DUP1 ISZERO PUSH2 0x184 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH1 0x1 PUSH20 0x7130D2A12B9BCBFAE4F2634D864A1EE1CE3EAD9C SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x1 PUSH20 0xE9E7CEA3DEDCA5984780BAFC599BD69ADD087D56 SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x2 PUSH20 0x7130D2A12B9BCBFAE4F2634D864A1EE1CE3EAD9C SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x2 PUSH20 0xBB4CDB9CBD36B01BD1CBAEBF2DE08D9173BC095C SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x3 PUSH20 0x7130D2A12B9BCBFAE4F2634D864A1EE1CE3EAD9C SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH1 0x3 PUSH20 0x2170ED0880AC9A755FD29B2688956BD959F933F8 SWAP1 DUP1 PUSH1 0x1 DUP2 SLOAD ADD DUP1 DUP3 SSTORE DUP1 SWAP2 POP POP PUSH1 0x1 SWAP1 SUB SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 ADD PUSH1 0x0 SWAP1 SWAP2 SWAP1 SWAP2 SWAP1 SWAP2 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP PUSH2 0x52A JUMP JUMPDEST DUP3 DUP1 SLOAD DUP3 DUP3 SSTORE SWAP1 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 SWAP1 DUP2 ADD SWAP3 DUP3 ISZERO PUSH2 0x4CD JUMPI SWAP2 PUSH1 0x20 MUL DUP3 ADD JUMPDEST DUP3 DUP2 GT ISZERO PUSH2 0x4CC JUMPI DUP3 MLOAD DUP3 PUSH1 0x0 PUSH2 0x100 EXP DUP2 SLOAD DUP2 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF MUL NOT AND SWAP1 DUP4 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND MUL OR SWAP1 SSTORE POP SWAP2 PUSH1 0x20 ADD SWAP2 SWAP1 PUSH1 0x1 ADD SWAP1 PUSH2 0x474 JUMP JUMPDEST JUMPDEST POP SWAP1 POP PUSH2 0x4DA SWAP2 SWAP1 PUSH2 0x4DE JUMP JUMPDEST POP SWAP1 JUMP JUMPDEST JUMPDEST DUP1 DUP3 GT ISZERO PUSH2 0x4F7 JUMPI PUSH1 0x0 DUP2 PUSH1 0x0 SWAP1 SSTORE POP PUSH1 0x1 ADD PUSH2 0x4DF JUMP JUMPDEST POP SWAP1 JUMP JUMPDEST PUSH32 0x4E487B7100000000000000000000000000000000000000000000000000000000 PUSH1 0x0 MSTORE PUSH1 0x41 PUSH1 0x4 MSTORE PUSH1 0x24 PUSH1 0x0 REVERT JUMPDEST PUSH2 0x747 DUP1 PUSH2 0x539 PUSH1 0x0 CODECOPY PUSH1 0x0 RETURN INVALID PUSH1 0x80 PUSH1 0x40 MSTORE CALLVALUE DUP1 ISZERO PUSH2 0x10 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP PUSH1 0x4 CALLDATASIZE LT PUSH2 0x41 JUMPI PUSH1 0x0 CALLDATALOAD PUSH1 0xE0 SHR DUP1 PUSH4 0x14F6C3BE EQ PUSH2 0x46 JUMPI DUP1 PUSH4 0x78A619DE EQ PUSH2 0x64 JUMPI DUP1 PUSH4 0xE62854C7 EQ PUSH2 0x82 JUMPI JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH2 0x4E PUSH2 0xA0 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x5B SWAP2 SWAP1 PUSH2 0x4F4 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x6C PUSH2 0x175 JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x79 SWAP2 SWAP1 PUSH2 0x4F4 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH2 0x8A PUSH2 0x24A JUMP JUMPDEST PUSH1 0x40 MLOAD PUSH2 0x97 SWAP2 SWAP1 PUSH2 0x4F4 JUMP JUMPDEST PUSH1 0x40 MLOAD DUP1 SWAP2 SUB SWAP1 RETURN JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x0 SWAP1 SLOAD SWAP1 PUSH2 0x100 EXP SWAP1 DIV PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH4 0xD06CA61F PUSH1 0x1 PUSH1 0x3 PUSH1 0x40 MLOAD DUP4 PUSH4 0xFFFFFFFF AND PUSH1 0xE0 SHL DUP2 MSTORE PUSH1 0x4 ADD PUSH2 0x100 SWAP3 SWAP2 SWAP1 PUSH2 0x4C4 JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 MLOAD DUP1 DUP4 SUB DUP2 DUP7 DUP1 EXTCODESIZE ISZERO DUP1 ISZERO PUSH2 0x118 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP GAS STATICCALL ISZERO DUP1 ISZERO PUSH2 0x12C JUMPI RETURNDATASIZE PUSH1 0x0 DUP1 RETURNDATACOPY RETURNDATASIZE PUSH1 0x0 REVERT JUMPDEST POP POP POP POP PUSH1 0x40 MLOAD RETURNDATASIZE PUSH1 0x0 DUP3 RETURNDATACOPY RETURNDATASIZE PUSH1 0x1F NOT PUSH1 0x1F DUP3 ADD AND DUP3 ADD DUP1 PUSH1 0x40 MSTORE POP DUP2 ADD SWAP1 PUSH2 0x155 SWAP2 SWAP1 PUSH2 0x3D1 JUMP JUMPDEST PUSH1 0x1 DUP2 MLOAD DUP2 LT PUSH2 0x168 JUMPI PUSH2 0x167 PUSH2 0x657 JUMP JUMPDEST JUMPDEST PUSH1 0x20 MUL PUSH1 0x20 ADD ADD MLOAD SWAP1 POP SWAP1 JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x0 SWAP1 SLOAD SWAP1 PUSH2 0x100 EXP SWAP1 DIV PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH4 0xD06CA61F PUSH1 0x1 PUSH1 0x2 PUSH1 0x40 MLOAD DUP4 PUSH4 0xFFFFFFFF AND PUSH1 0xE0 SHL DUP2 MSTORE PUSH1 0x4 ADD PUSH2 0x1D5 SWAP3 SWAP2 SWAP1 PUSH2 0x4C4 JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 MLOAD DUP1 DUP4 SUB DUP2 DUP7 DUP1 EXTCODESIZE ISZERO DUP1 ISZERO PUSH2 0x1ED JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP GAS STATICCALL ISZERO DUP1 ISZERO PUSH2 0x201 JUMPI RETURNDATASIZE PUSH1 0x0 DUP1 RETURNDATACOPY RETURNDATASIZE PUSH1 0x0 REVERT JUMPDEST POP POP POP POP PUSH1 0x40 MLOAD RETURNDATASIZE PUSH1 0x0 DUP3 RETURNDATACOPY RETURNDATASIZE PUSH1 0x1F NOT PUSH1 0x1F DUP3 ADD AND DUP3 ADD DUP1 PUSH1 0x40 MSTORE POP DUP2 ADD SWAP1 PUSH2 0x22A SWAP2 SWAP1 PUSH2 0x3D1 JUMP JUMPDEST PUSH1 0x1 DUP2 MLOAD DUP2 LT PUSH2 0x23D JUMPI PUSH2 0x23C PUSH2 0x657 JUMP JUMPDEST JUMPDEST PUSH1 0x20 MUL PUSH1 0x20 ADD ADD MLOAD SWAP1 POP SWAP1 JUMP JUMPDEST PUSH1 0x0 DUP1 PUSH1 0x0 SWAP1 SLOAD SWAP1 PUSH2 0x100 EXP SWAP1 DIV PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF AND PUSH4 0xD06CA61F PUSH1 0x1 DUP1 PUSH1 0x40 MLOAD DUP4 PUSH4 0xFFFFFFFF AND PUSH1 0xE0 SHL DUP2 MSTORE PUSH1 0x4 ADD PUSH2 0x2A9 SWAP3 SWAP2 SWAP1 PUSH2 0x4C4 JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 MLOAD DUP1 DUP4 SUB DUP2 DUP7 DUP1 EXTCODESIZE ISZERO DUP1 ISZERO PUSH2 0x2C1 JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP GAS STATICCALL ISZERO DUP1 ISZERO PUSH2 0x2D5 JUMPI RETURNDATASIZE PUSH1 0x0 DUP1 RETURNDATACOPY RETURNDATASIZE PUSH1 0x0 REVERT JUMPDEST POP POP POP POP PUSH1 0x40 MLOAD RETURNDATASIZE PUSH1 0x0 DUP3 RETURNDATACOPY RETURNDATASIZE PUSH1 0x1F NOT PUSH1 0x1F DUP3 ADD AND DUP3 ADD DUP1 PUSH1 0x40 MSTORE POP DUP2 ADD SWAP1 PUSH2 0x2FE SWAP2 SWAP1 PUSH2 0x3D1 JUMP JUMPDEST PUSH1 0x1 DUP2 MLOAD DUP2 LT PUSH2 0x311 JUMPI PUSH2 0x310 PUSH2 0x657 JUMP JUMPDEST JUMPDEST PUSH1 0x20 MUL PUSH1 0x20 ADD ADD MLOAD SWAP1 POP SWAP1 JUMP JUMPDEST PUSH1 0x0 PUSH2 0x331 PUSH2 0x32C DUP5 PUSH2 0x534 JUMP JUMPDEST PUSH2 0x50F JUMP JUMPDEST SWAP1 POP DUP1 DUP4 DUP3 MSTORE PUSH1 0x20 DUP3 ADD SWAP1 POP DUP3 DUP6 PUSH1 0x20 DUP7 MUL DUP3 ADD GT ISZERO PUSH2 0x354 JUMPI PUSH2 0x353 PUSH2 0x6CD JUMP JUMPDEST JUMPDEST PUSH1 0x0 JUMPDEST DUP6 DUP2 LT ISZERO PUSH2 0x384 JUMPI DUP2 PUSH2 0x36A DUP9 DUP3 PUSH2 0x3BC JUMP JUMPDEST DUP5 MSTORE PUSH1 0x20 DUP5 ADD SWAP4 POP PUSH1 0x20 DUP4 ADD SWAP3 POP POP PUSH1 0x1 DUP2 ADD SWAP1 POP PUSH2 0x357 JUMP JUMPDEST POP POP POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x0 DUP3 PUSH1 0x1F DUP4 ADD SLT PUSH2 0x3A3 JUMPI PUSH2 0x3A2 PUSH2 0x6C8 JUMP JUMPDEST JUMPDEST DUP2 MLOAD PUSH2 0x3B3 DUP5 DUP3 PUSH1 0x20 DUP7 ADD PUSH2 0x31E JUMP JUMPDEST SWAP2 POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 DUP2 MLOAD SWAP1 POP PUSH2 0x3CB DUP2 PUSH2 0x6FA JUMP JUMPDEST SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x20 DUP3 DUP5 SUB SLT ISZERO PUSH2 0x3E7 JUMPI PUSH2 0x3E6 PUSH2 0x6D7 JUMP JUMPDEST JUMPDEST PUSH1 0x0 DUP3 ADD MLOAD PUSH8 0xFFFFFFFFFFFFFFFF DUP2 GT ISZERO PUSH2 0x405 JUMPI PUSH2 0x404 PUSH2 0x6D2 JUMP JUMPDEST JUMPDEST PUSH2 0x411 DUP5 DUP3 DUP6 ADD PUSH2 0x38E JUMP JUMPDEST SWAP2 POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x426 DUP4 DUP4 PUSH2 0x432 JUMP JUMPDEST PUSH1 0x20 DUP4 ADD SWAP1 POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH2 0x43B DUP2 PUSH2 0x5BE JUMP JUMPDEST DUP3 MSTORE POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x44C DUP3 PUSH2 0x575 JUMP JUMPDEST PUSH2 0x456 DUP2 DUP6 PUSH2 0x58D JUMP JUMPDEST SWAP4 POP PUSH2 0x461 DUP4 PUSH2 0x560 JUMP JUMPDEST DUP1 PUSH1 0x0 JUMPDEST DUP4 DUP2 LT ISZERO PUSH2 0x499 JUMPI PUSH2 0x476 DUP3 PUSH2 0x6B5 JUMP JUMPDEST PUSH2 0x480 DUP9 DUP3 PUSH2 0x41A JUMP JUMPDEST SWAP8 POP PUSH2 0x48B DUP4 PUSH2 0x580 JUMP JUMPDEST SWAP3 POP POP PUSH1 0x1 DUP2 ADD SWAP1 POP PUSH2 0x465 JUMP JUMPDEST POP DUP6 SWAP4 POP POP POP POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH2 0x4AF DUP2 PUSH2 0x5FA JUMP JUMPDEST DUP3 MSTORE POP POP JUMP JUMPDEST PUSH2 0x4BE DUP2 PUSH2 0x5F0 JUMP JUMPDEST DUP3 MSTORE POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 DUP3 ADD SWAP1 POP PUSH2 0x4D9 PUSH1 0x0 DUP4 ADD DUP6 PUSH2 0x4A6 JUMP JUMPDEST DUP2 DUP2 SUB PUSH1 0x20 DUP4 ADD MSTORE PUSH2 0x4EB DUP2 DUP5 PUSH2 0x441 JUMP JUMPDEST SWAP1 POP SWAP4 SWAP3 POP POP POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x20 DUP3 ADD SWAP1 POP PUSH2 0x509 PUSH1 0x0 DUP4 ADD DUP5 PUSH2 0x4B5 JUMP JUMPDEST SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x519 PUSH2 0x52A JUMP JUMPDEST SWAP1 POP PUSH2 0x525 DUP3 DUP3 PUSH2 0x626 JUMP JUMPDEST SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x40 MLOAD SWAP1 POP SWAP1 JUMP JUMPDEST PUSH1 0x0 PUSH8 0xFFFFFFFFFFFFFFFF DUP3 GT ISZERO PUSH2 0x54F JUMPI PUSH2 0x54E PUSH2 0x686 JUMP JUMPDEST JUMPDEST PUSH1 0x20 DUP3 MUL SWAP1 POP PUSH1 0x20 DUP2 ADD SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 SWAP1 POP DUP2 PUSH1 0x0 MSTORE PUSH1 0x20 PUSH1 0x0 KECCAK256 SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 SLOAD SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH1 0x1 DUP3 ADD SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP3 DUP3 MSTORE PUSH1 0x20 DUP3 ADD SWAP1 POP SWAP3 SWAP2 POP POP JUMP JUMPDEST PUSH1 0x0 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF DUP3 AND SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x5C9 DUP3 PUSH2 0x5D0 JUMP JUMPDEST SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH20 0xFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF DUP3 AND SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x605 DUP3 PUSH2 0x5F0 JUMP JUMPDEST SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 PUSH2 0x61F PUSH2 0x61A DUP4 PUSH2 0x6ED JUMP JUMPDEST PUSH2 0x59E JUMP JUMPDEST SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH2 0x62F DUP3 PUSH2 0x6DC JUMP JUMPDEST DUP2 ADD DUP2 DUP2 LT PUSH8 0xFFFFFFFFFFFFFFFF DUP3 GT OR ISZERO PUSH2 0x64E JUMPI PUSH2 0x64D PUSH2 0x686 JUMP JUMPDEST JUMPDEST DUP1 PUSH1 0x40 MSTORE POP POP POP JUMP JUMPDEST PUSH32 0x4E487B7100000000000000000000000000000000000000000000000000000000 PUSH1 0x0 MSTORE PUSH1 0x32 PUSH1 0x4 MSTORE PUSH1 0x24 PUSH1 0x0 REVERT JUMPDEST PUSH32 0x4E487B7100000000000000000000000000000000000000000000000000000000 PUSH1 0x0 MSTORE PUSH1 0x41 PUSH1 0x4 MSTORE PUSH1 0x24 PUSH1 0x0 REVERT JUMPDEST PUSH1 0x0 PUSH2 0x6C1 DUP3 SLOAD PUSH2 0x60C JUMP JUMPDEST SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 DUP1 REVERT JUMPDEST PUSH1 0x0 PUSH1 0x1F NOT PUSH1 0x1F DUP4 ADD AND SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH1 0x0 DUP2 PUSH1 0x0 SHR SWAP1 POP SWAP2 SWAP1 POP JUMP JUMPDEST PUSH2 0x703 DUP2 PUSH2 0x5F0 JUMP JUMPDEST DUP2 EQ PUSH2 0x70E JUMPI PUSH1 0x0 DUP1 REVERT JUMPDEST POP JUMP INVALID LOG2 PUSH5 0x6970667358 0x22 SLT KECCAK256 PUSH23 0x22455F23BD6AC80DCCD7C1D2F53FD91327F90A3FD7CFA2 LOG4 GASLIMIT POP PUSH15 0x1A0CFC4964736F6C63430008070033 \",\n"
            + "\t\"sourceMap\": \"157:1094:2:-:0;;;212:42;182:72;;;;;;;;;;;;;;;;;;;;304:1;290:16;;;;;;;;:::i;:::-;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;261:45;;;;;;;;;;;;;:::i;:::-;;355:1;341:16;;;;;;;;:::i;:::-;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;312:45;;;;;;;;;;;;;:::i;:::-;;406:1;392:16;;;;;;;;:::i;:::-;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;363:45;;;;;;;;;;;;;:::i;:::-;;415:425;;;;;;;;;;439:8;453:42;439:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;506:8;520:42;506:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;574:8;588:42;574:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;641:8;655:42;641:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;709:8;723:42;709:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;776:8;790:42;776:57;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;157:1094;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;:::i;:::-;;;:::o;:::-;;;;;;;;;;;;;;;;;;;;;:::o;7:180:3:-;55:77;52:1;45:88;152:4;149:1;142:15;176:4;173:1;166:15;157:1094:2;;;;;;;\"\n"
            + "}";

    public static final String FUNC_GETBNB = "getBNB";

    public static final String FUNC_GETBTC = "getBTC";

    public static final String FUNC_GETETH = "getETH";

    @Deprecated
    protected TestTask(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected TestTask(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected TestTask(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected TestTask(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<BigInteger> getBNB() {
        final Function function = new Function(FUNC_GETBNB, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getBTC() {
        final Function function = new Function(FUNC_GETBTC, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<BigInteger> getETH() {
        final Function function = new Function(FUNC_GETETH, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    @Deprecated
    public static TestTask load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestTask(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static TestTask load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new TestTask(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static TestTask load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new TestTask(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static TestTask load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new TestTask(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<TestTask> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestTask.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<TestTask> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(TestTask.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestTask> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestTask.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<TestTask> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(TestTask.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }
}
