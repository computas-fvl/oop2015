RSpec.describe Example do
  describe '.max' do
    def apply
      Example.max(array)
    end

    context 'when array is empty' do
      let(:array) { [] }

      it 'returns nil' do
        expect(apply).to be(nil)
      end
    end
  end
end
