set nocompatible
set nobackup
set noswapfile
set history=1024
set autochdir
set incsearch
set wildmenu
set number
set whichwrap=b,s,<,>,[,]
set backspace=indent,eol,start
set nowrap
set cursorline
set hlsearch
set autoindent
set smartindent
set tabstop=4
set expandtab
set softtabstop=4
set foldmethod=indent
set clipboard=unnamed

set fileencodings=utf-8,gbk2312,gbk,gb18030,cp936
set encoding=utf-8
set langmenu=zh_CN

syntax on
syntax enable

set ff=unix
"
"set guifont=Consolas:h10
"set guioptions-=m
"set guioptions-=T
"set guioptions-=L
"set guioptions-=r
"set guioptions-=b
"set lines=45 columns=195

filetype on
filetype plugin on

let mapleader=","
nmap <leader>SO :source ~/.vimrc<CR>
map <leader>e $
map <leader>B 0
map <leader>b ^
nmap <leader>w :w<CR>
nmap <leader>q :q<CR>
nmap <leader>Q :q!<CR>
nmap <leader>p "+p
nmap <leader>y "+y
nnoremap nw <C-W><C-W>
nnoremap <leader>lw <C-W>l
nnoremap <Leader>hw <C-W>h
nnoremap <Leader>kw <C-W>k
nnoremap <Leader>jw <C-W>j
nnoremap <leader><space> :set nohlsearch<CR>
"结对符之间跳转
nmap <Leader>M %
"buffer and tab
map <leader>tn :tabnew<CR>
map <leader>tc :tabclose<CR>
map <leader>tj :tabp<CR>
map <leader>tk :tabn<CR>
nnoremap <leader>ls :ls<CR>
nnoremap <leader>bn :bn<CR>
nnoremap <leader>bp :bp<CR>
"插入模式
inoremap <M-j> <Down>
inoremap <M-k> <Up>
inoremap <M-h> <left>
inoremap <M-l> <Right>
inoremap <C-A> <Home>
inoremap <C-B> <End>

"打开当前目录的Windows Explorer
map <leader>ex :!start explorer %:p:h<CR>
" 打开当前目录CMD
map <leader>cmd :!start<cr>

filetype off
set rtp+=$HOME/.vim/bundle/Vundle.vim
call vundle#begin()
Plugin 'VundleVim/Vundle.vim'
Bundle 'scrooloose/nerdtree'
Bundle 'altercation/vim-colors-solarized'
Bundle 'tpope/vim-surround'
Bundle 'jiangmiao/auto-pairs'
Bundle 'ctrlpvim/ctrlp.vim'
Bundle 'matchit.zip'
Bundle 'vim-airline/vim-airline'
Bundle 'vim-airline/vim-airline-themes'
Bundle 'bling/vim-bufferline'
Bundle 'scrooloose/syntastic'
Bundle 'tpope/vim-fugitive'
Bundle 'mattn/webapi-vim'
Bundle 'mattn/gist-vim'
Bundle 'scrooloose/nerdcommenter'
Bundle 'tpope/vim-commentary'
Bundle 'godlygeek/tabular'
Bundle 'luochen1990/rainbow'
Bundle 'majutsushi/tagbar'
Bundle 'Valloric/YouCompleteMe'
Bundle 'SirVer/ultisnips'
Bundle 'honza/vim-snippets'
"Bundle 'klen/python-mode'
Bundle 'yssource/python.vim'
Bundle 'python_match.vim'
Bundle 'pythoncomplete'
Bundle 'elzr/vim-json'
Bundle 'groenewege/vim-less'
Bundle 'pangloss/vim-javascript'
Bundle 'briancollins/vim-jst'
Bundle 'kchmck/vim-coffee-script'
Bundle 'derekwyatt/vim-scala'
Bundle 'derekwyatt/vim-sbt'
Bundle 'xptemplate'
Bundle 'vim-scripts/HTML-AutoCloseTag'
Bundle 'hail2u/vim-css3-syntax'
Bundle 'gorodinskiy/vim-coloresque'
Bundle 'tpope/vim-haml'
Bundle 'mattn/emmet-vim'
Bundle 'fatih/vim-go'
Bundle 'guns/vim-clojure-static'
call vundle#end()
filetype plugin indent on

" nerdtree
map <C-E> :NERDTreeToggle<CR>
autocmd bufenter * if (winnr("$") == 1 && exists("b:NERDTree") && b:NERDTree.isTabTree()) | q | endif
let g:NERDTreeShowHidden = 1
let g:NERDTreeQuitOnOpen = 1

" vim-color-solarized
let g:solarized_termcolors=256
set background=dark
colorscheme solarized

" vim-surround

" auto-pairs
let g:AutoPairsFlyMode = 0

" ctrlp.vim

" vim-airline, vim-airline-themes
let g:airline#extensions#tabline#enabled = 1
let g:airline#extensions#tabline#left_sep = ' '
let g:airline#extensions#tabline#left_alt_sep = '|'
let g:airline#extensions#tabline#formatter = 'default'

" syntastic

" webapi-vim

" gist-vim

" nerdcommenter

" vim-commentary
nmap <Leader>a= :Tabularize /=<CR>
vmap <Leader>a= :Tabularize /=<CR>
nmap <Leader>a: :Tabularize /:\zs<CR>
vmap <Leader>a: :Tabularize /:\zs<CR>

" tabular

" rainbow

" tagbar
nmap <F8> :TagbarToggle<CR>

" YouCompleteMe
" requests-futures版本可能不匹配，需要手动下载，pip install requests-futures
let g:syntastic_java_checkers = []
let g:ycm_global_ycm_extra_conf = '$HOME/.vim/bundle/YouCompleteMe/third_party/ycmd/examples/.ycm_extra_conf.py'
nnoremap <leader>gd :YcmCompleter GoToDefinitionElseDeclaration<CR>
nnoremap <leader>gr :YcmCompleter GoToReferences<CR>

